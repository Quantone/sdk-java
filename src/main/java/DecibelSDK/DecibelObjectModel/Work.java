package DecibelSDK.DecibelObjectModel;

import DecibelSDK.InternalUtilities;
import com.google.gson.annotations.SerializedName;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Work extends DecibelEntity{
    private String id;

    /**
     * @return the Id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the Id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    private String name;

    /**
     * @return the Name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the Name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    private Integer recordingSequence;

    /**
     * @return the RecordingSequence
     */
    public Integer getRecordingSequence() {
        return recordingSequence;
    }

    /**
     * @param recordingSequence the RecordingSequence to set
     */
    public void setRecordingSequence(Integer recordingSequence) {
        this.recordingSequence = recordingSequence;
    }

    private Participation[] participations;

    /**
     * @return the Participations
     */
    public Participation[] getParticipations() {
        return participations;
    }

    /**
     * @param participations the Participations to set
     */
    public void setParticipations(Participation[] participations) {
        this.participations = participations;
    }

}
