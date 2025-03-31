package io.medsys.opteamer.model.embeddedids;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperationReportId implements Serializable {
    @Column(name="team_member_id")
    private Long teamMemberId;

   @Column(name="operation_id")
    private Long operationId;
}
