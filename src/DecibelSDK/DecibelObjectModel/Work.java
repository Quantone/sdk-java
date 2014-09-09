package DecibelSDK.DecibelObjectModel;

import java.util.List;

public class Work extends DecibelEntity { 
    private String idField;

    /**
     * @return the Id
     */
    public String getId() {
        return idField;
    }

    /**
     * @param id the Id to set
     */
    public void setId(String id) {
        this.idField = id;
    }

    private String nameField;

    /**
     * @return the Name
     */
    public String getName() {
        return nameField;
    }

    /**
     * @param name the Name to set
     */
    public void setName(String name) {
        this.nameField = name;
    }

    private WorkType workTypeField;

    /**
     * @return the WorkType
     */
    public WorkType getWorkType() {
        return workTypeField;
    }

    /**
     * @param workType the WorkType to set
     */
    public void setWorkType(WorkType workType) {
        this.workTypeField = workType;
    }

    private Integer recordingSequenceField;

    /**
     * @return the RecordingSequence
     */
    public Integer getRecordingSequence() {
        return recordingSequenceField;
    }

    /**
     * @param recordingSequence the RecordingSequence to set
     */
    public void setRecordingSequence(Integer recordingSequence) {
        this.recordingSequenceField = recordingSequence;
    }

    private List<Participation> participationsField;

    /**
     * @return the Participations
     */
    public List<Participation> getParticipations() {
        return participationsField;
    }

    /**
     * @param participations the Participations to set
     */
    public void setParticipations(List<Participation> participations) {
        this.participationsField = participations;
    }

}
