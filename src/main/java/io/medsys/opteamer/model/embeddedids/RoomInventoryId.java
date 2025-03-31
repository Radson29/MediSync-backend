package io.medsys.opteamer.model.embeddedids;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RoomInventoryId implements Serializable {
    @Column(name = "room_id")
    private Long roomId;
    @Column(name = "asset_id")
    private Long assetId;
}
