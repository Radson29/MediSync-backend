package io.medsys.opteamer.model;

import io.medsys.opteamer.model.embeddedids.AssessmentId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "assesments")
@NoArgsConstructor
@Getter
@Setter
public class Assessment {

    @EmbeddedId
    private AssessmentId assessmentId;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @ManyToOne
    @MapsId("teamMemberId")
    @JoinColumn(name = "team_member_id")
    private TeamMember teamMember;

    @ManyToOne
    @MapsId("patientId")
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "pre_op_a_id", referencedColumnName = "name", insertable = false, updatable = false)
    private PreOperativeAssessment preOperativeAssessment;

}
