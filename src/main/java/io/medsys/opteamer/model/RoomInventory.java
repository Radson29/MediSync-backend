package io.medsys.opteamer.model;

import io.medsys.opteamer.model.embeddedids.RoomInventoryId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "room_inventory")
public class RoomInventory {
    @EmbeddedId
    private RoomInventoryId roomInventoryId;

    private Integer count;

    @ManyToOne
    @MapsId("assetId")
    @JoinColumn(name = "asset_id")
    private Asset asset;

    @ManyToOne
    @MapsId("roomId")
    @JoinColumn(name = "room_id")
    private OperationRoom operationRoom;
}
