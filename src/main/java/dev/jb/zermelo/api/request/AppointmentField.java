package dev.jb.zermelo.api.request;

public enum AppointmentField {

    APPOINTMENT_INSTANCE("appointmentInstance"),
    ID("id"),
    START("start"),
    END("end"),
    START_TIME_SLOT("startTimeSlot"),
    END_TIME_SLOT("endTimeSlot"),
    ADJUSTED_TEACHING_TIME("adjustedTeachingTime"),
    SUBJECTS("subjects"),
    SUBJECTS_DETAILED("subjectsDetailed"),
    TYPE("type"),
    REMARK("remark"),
    LOCATIONS("locations"),
    LOCATIONS_OF_BRANCH("locationsOfBranch"),
    TEACHERS("teachers"),
    TEACHERS_DETAILED("teachers_detailed"),
    STUDENTS("students"),
    GROUPS("groups"),
    GROUPS_IN_DEPARTMENTS("groupsInDepartments"),
    CREATED("created"),
    LAST_MODIFIED("lastModified"),
    VALID("valid"),
    HIDDEN("hidden"),
    BASE("base"),
    CANCELLED("cancelled"),
    MODIFIED("modified"),
    MOVED("moved"),
    NEW("new"),
    CHANGE_DESCRIPTION("changeDescription"),
    ORIGINAL_APPOINTMENT("originalAppointment"),
    UPDATED_APPOINTMENT("updatedAppointment"),
    BRANCH_OF_SCHOOL("branchOfSchool"),
    BRANCH("branch"),
    COMMON_SCHEDULE("commonSchedule");

    private final String internal;

    AppointmentField(String internal) {
        this.internal = internal;
    }

    @Override
    public String toString() {
        return internal;
    }

}
