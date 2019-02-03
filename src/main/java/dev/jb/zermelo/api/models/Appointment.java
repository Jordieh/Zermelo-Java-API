package dev.jb.zermelo.api.models;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class Appointment {

    private final long appointmentInstance;
    private final long id;

    private final Instant start;
    private final Instant end;
    private final int startTimeSlot;
    private final int endTimeSlot;
    @Deprecated
    private final Long adjustedTeachingTime;

    private final String[] subjects;
    @Deprecated
//    private final JsonArray subjectsDetailed;
    private final Type type;
    private final String remark;

    private final String[] locations;
//    private final JsonArray locationsOfBranch;

    private final String[] teachers;
    @Deprecated
//    private final JsonArray teachersDetailed;
    private final String[] students;
    private final String[] groups;
//    private final JsonArray groupInDepartment;

    private final Instant created;
    private final Instant lastModified;
    private final boolean valid;
    private final boolean hidden;
    private final boolean base;
    private final boolean cancelled;
    private final boolean modified;
    private final boolean moved;
    private final boolean _new;
    private final String changeDescription;
    private final long originalAppointment;
    private final long updatedAppointment;

    private final long branchOfSchool;
    private final String branch;
    @Deprecated
    private final boolean commonSchedule;

    public Appointment(long appointmentInstance, long id, Instant start, Instant end, int startTimeSlot, int endTimeSlot, Long adjustedTeachingTime, String[] subjects, Type type, String remark, String[] locations, String[] teachers, String[] students, String[] groups, Instant created, Instant lastModified, boolean valid, boolean hidden, boolean base, boolean cancelled, boolean modified, boolean moved, boolean _new, String changeDescription, long originalAppointment, long updatedAppointment, long branchOfSchool, String branch, boolean commonSchedule) {
        this.appointmentInstance = appointmentInstance;
        this.id = id;
        this.start = start;
        this.end = end;
        this.startTimeSlot = startTimeSlot;
        this.endTimeSlot = endTimeSlot;
        this.adjustedTeachingTime = adjustedTeachingTime;
        this.subjects = subjects;
        this.type = type;
        this.remark = remark;
        this.locations = locations;
        this.teachers = teachers;
        this.students = students;
        this.groups = groups;
        this.created = created;
        this.lastModified = lastModified;
        this.valid = valid;
        this.hidden = hidden;
        this.base = base;
        this.cancelled = cancelled;
        this.modified = modified;
        this.moved = moved;
        this._new = _new;
        this.changeDescription = changeDescription;
        this.originalAppointment = originalAppointment;
        this.updatedAppointment = updatedAppointment;
        this.branchOfSchool = branchOfSchool;
        this.branch = branch;
        this.commonSchedule = commonSchedule;
    }

    public long getAppointmentInstance() {
        return appointmentInstance;
    }

    public long getId() {
        return id;
    }

    public Instant getStart() {
        return start;
    }

    public Instant getEnd() {
        return end;
    }

    public int getStartTimeSlot() {
        return startTimeSlot;
    }

    public int getEndTimeSlot() {
        return endTimeSlot;
    }

    public Duration getAdjustedTeachingTime() {
        return (adjustedTeachingTime == null) ? Duration.ofSeconds(end.getEpochSecond() - start.getEpochSecond()) : Duration.ofSeconds(adjustedTeachingTime);
    }

    public List<String> getSubjects() {
        return Arrays.asList(subjects);
    }

    public Type getType() {
        return type;
    }

    public String getRemark() {
        return remark;
    }

    public List<String> getLocations() {
        return Arrays.asList(locations);
    }

    public List<String> getTeachers() {
        return Arrays.asList(teachers);
    }

    public List<String> getStudents() {
        return Arrays.asList(students);
    }

    public List<String> getGroups() {
        return Arrays.asList(groups);
    }

    public Instant getCreated() {
        return created;
    }

    public Instant getLastModified() {
        return lastModified;
    }

    public boolean isValid() {
        return valid;
    }

    public boolean isHidden() {
        return hidden;
    }

    public boolean isBase() {
        return base;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public boolean isModified() {
        return modified;
    }

    public boolean isMoved() {
        return moved;
    }

    public boolean isNew() {
        return _new;
    }

    public String getChangeDescription() {
        return changeDescription;
    }

    public long getOriginalAppointment() {
        return originalAppointment;
    }

    public long getUpdatedAppointment() {
        return updatedAppointment;
    }

    public long getBranchOfSchool() {
        return branchOfSchool;
    }

    public String getBranch() {
        return branch;
    }

    public boolean isCommonSchedule() {
        return commonSchedule;
    }

    public enum Type {
        UNKNOWN, LESSON, EXAM, ACTIVITY, CHOICE, TALK, OTHER
    }

}
