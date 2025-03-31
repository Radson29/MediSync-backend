package io.medsys.opteamer.model;
import io.medsys.opteamer.model.enums.OperationState;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "operations")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private OperationType operationType;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private OperationRoom operationRoom;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @Column(name = "state")
    @Enumerated(EnumType.STRING)
    private OperationState state;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "operation_team_member",
        joinColumns = @JoinColumn(name = "operation_id"),
        inverseJoinColumns = @JoinColumn(name = "team_member_id")
    )
    private Set<TeamMember> teamMembers = new HashSet<TeamMember>();

}
