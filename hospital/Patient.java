package hospital;
//Patient class having patient name and priority
 class Patient {

    private int patientPriority;
    private String patientName;
    private int patientId;

    public Patient(int id, String name, int priority) {
        this.patientName = name;
        this.patientPriority = priority;
        this.patientId = id;
    }

    public int getPriority() {

        return patientPriority;
    }

    public int getId() {

        return patientId;
    }

    public String getName() {

        return patientName;
    }
}
