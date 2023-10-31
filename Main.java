import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map;
import java.util.Comparator;
import java.util.Optional;


public class Main {
    static List<Student> students;












    public static void main(String[] var0) throws IOException {
        cargarArchivo();

        imprimirEstudiantesPorCarrera();

        long totalMujeres = contarMujeres();
        System.out.println("Total de mujeres: " + totalMujeres);

        long totalHombres = contarHombres();
        System.out.println("Total de hombres: " + totalHombres);

        imprimirMaxMathScorePorCarrera();
        imprimirEstudianteConMaxMathScore();
        imprimirPuntajePromedioPorCarrera();

    }

    public static Map<String, List<Student>> estudiantesAgrupadosPorCarrera() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getCareerAspiration));
    }

    public static void imprimirEstudiantesPorCarrera() {
        Map<String, List<Student>> mapaDeEstudiantes = estudiantesAgrupadosPorCarrera();

        mapaDeEstudiantes.forEach((carrera, listaDeEstudiantes) -> {
            System.out.println("Carrera: " + carrera);
            System.out.println("Total de aspirantes: " + listaDeEstudiantes.size());
            listaDeEstudiantes.forEach(System.out::println);
            System.out.println("");
        });
    }

    static void cargarArchivo() {
        Pattern pattern = Pattern.compile(",");
        String fileName = "student-scores.csv";
        Path filePath = Path.of(fileName);

        // Verificando la ruta del archivo
        System.out.println("Intentando cargar desde: " + filePath.toAbsolutePath());

        // Comprobando si el archivo existe reemplazar con try catch
        if (!Files.exists(filePath)) {
            System.out.println("ERROR: El archivo no existe en la ruta especificada.");
            students = new ArrayList<>();
            return;
        }

        try (Stream<String> lines = Files.lines(filePath)) {
            students = lines.skip(1)
                    .map(line -> {
                        String[] parts = pattern.split(line);
                        //Reemplazar con un for y un try catch
                        if (parts.length == 17) {
                            try {
                                return new Student(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5],
                                        Integer.parseInt(parts[6]), parts[7], Integer.parseInt(parts[8]),
                                        parts[9], Integer.parseInt(parts[10]), Integer.parseInt(parts[11]),
                                        Integer.parseInt(parts[12]), Integer.parseInt(parts[13]),
                                        Integer.parseInt(parts[14]), Integer.parseInt(parts[15]),
                                        Integer.parseInt(parts[16]));
                            } catch (NumberFormatException e) {
                                System.out.println("Error al procesar la línea: " + line + ". Razón: " + e.getMessage());
                                return null;
                            }
                        } else {
                            System.out.println("Error: Línea con formato incorrecto: " + line);
                            return null;
                        }
                    })
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());



        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            students = new ArrayList<>();
        }
    }

    public static Map<String, Double> puntajePromedioPorCarrera() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getCareerAspiration,
                        Collectors.averagingInt(Student::getMathScore)));
    }
    public static void imprimirPuntajePromedioPorCarrera() {
        Map<String, Double> promediosPorCarrera = puntajePromedioPorCarrera();

        promediosPorCarrera.forEach((carrera, promedio) -> {
            System.out.println("Carrera: " + carrera);
            System.out.println("Puntaje promedio de Math Score: " + promedio);
            System.out.println("");
        });
    }

    public static Optional<Student> estudianteConMaxMathScore() {
        return students.stream()
                .max(Comparator.comparingInt(Student::getMathScore));
    }
    public static void imprimirEstudianteConMaxMathScore() {
        Optional<Student> maxScoreStudent = estudianteConMaxMathScore();

        System.out.println("Estudiante con el puntaje más alto en Math Score:");
        maxScoreStudent.ifPresent(s -> {
            System.out.println("Estudiante con el puntaje más alto: " + s.getFirstname() + " " + s.getLastName());
            System.out.println("Puntaje de Math Score: " + s.getMathScore());
        });
    }

    public static Map<String, Optional<Student>> maxMathScorePorCarrera() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getCareerAspiration,
                        Collectors.maxBy(Comparator.comparingInt(Student::getMathScore))));
    }
    public static void imprimirMaxMathScorePorCarrera() {
        Map<String, Optional<Student>> mapaPorCarrera = maxMathScorePorCarrera();

        mapaPorCarrera.forEach((carrera, optionalStudent) -> {
            System.out.println("Carrera: " + carrera);
            optionalStudent.ifPresent(s -> {
                System.out.println("Estudiante con el puntaje más alto: " + s.getFirstname() + " " + s.getLastName());
                System.out.println("Puntaje de Math Score: " + s.getMathScore());
            });
            System.out.println("");
        });
    }

    public static long contarMujeres() {
        return students.stream()
                .filter(student -> "female".equalsIgnoreCase(student.getGender()))
                .count();
    }

    public static long contarHombres() {
        return students.stream()
                .filter(student -> "male".equalsIgnoreCase(student.getGender()))
                .count();
    }





}