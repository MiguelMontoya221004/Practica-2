public class Student {
    private String id;
    private String firstname;
    private String lastName;
    private String email;
    private String gender;
    private String partTimeJob;
    private int absenceDays;
    private String extracurricularActivities;
    private int weeklySelfStudyHours;
    private String careerAspiration;
    private int mathScore;
    private int historyScore;
    private int physicsScore;
    private int chemistryScore;
    private int biologyScore;
    private int englishScore;
    private int geographyScore;

    public Student(String id, String firstname, String lastName, String email, String gender, String partTimeJob, int absenceDays, String extracurricularActivities, int weeklySelfStudyHours, String careerAspiration, int mathScore, int historyScore, int physicsScore, int chemistryScore, int biologyScore, int englishScore, int geographyScore) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.partTimeJob = partTimeJob;
        this.absenceDays = absenceDays;
        this.extracurricularActivities = extracurricularActivities;
        this.weeklySelfStudyHours = weeklySelfStudyHours;
        this.careerAspiration = careerAspiration;
        this.mathScore = mathScore;
        this.historyScore = historyScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
        this.biologyScore = biologyScore;
        this.englishScore = englishScore;
        this.geographyScore = geographyScore;
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getPartTimeJob() {
        return partTimeJob;
    }

    public int getAbsenceDays() {
        return absenceDays;
    }

    public String getExtracurricularActivities() {
        return extracurricularActivities;
    }

    public int getWeeklySelfStudyHours() {
        return weeklySelfStudyHours;
    }

    public String getCareerAspiration() {
        return careerAspiration;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getHistoryScore() {
        return historyScore;
    }

    public int getPhysicsScore() {
        return physicsScore;
    }

    public int getChemistryScore() {
        return chemistryScore;
    }

    public int getBiologyScore() {
        return biologyScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getGeographyScore() {
        return geographyScore;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPartTimeJob(String partTimeJob) {
        this.partTimeJob = partTimeJob;
    }

    public void setAbsenceDays(int absenceDays) {
        this.absenceDays = absenceDays;
    }

    public void setExtracurricularActivities(String extracurricularActivities) {
        this.extracurricularActivities = extracurricularActivities;
    }

    public void setWeeklySelfStudyHours(int weeklySelfStudyHours) {
        this.weeklySelfStudyHours = weeklySelfStudyHours;
    }

    public void setCareerAspiration(String careerAspiration) {
        this.careerAspiration = careerAspiration;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public void setHistoryScore(int historyScore) {
        this.historyScore = historyScore;
    }

    public void setPhysicsScore(int physicsScore) {
        this.physicsScore = physicsScore;
    }

    public void setChemistryScore(int chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    public void setBiologyScore(int biologyScore) {
        this.biologyScore = biologyScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public void setGeographyScore(int geographyScore) {
        this.geographyScore = geographyScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", partTimeJob='" + partTimeJob + '\'' +
                ", absenceDays=" + absenceDays +
                ", extracurricularActivities='" + extracurricularActivities + '\'' +
                ", weeklySelfStudyHours=" + weeklySelfStudyHours +
                ", careerAspiration='" + careerAspiration + '\'' +
                ", mathScore=" + mathScore +
                ", historyScore=" + historyScore +
                ", physicsScore=" + physicsScore +
                ", chemistryScore=" + chemistryScore +
                ", biologyScore=" + biologyScore +
                ", englishScore=" + englishScore +
                ", geographyScore=" + geographyScore +
                '}';
    }


}