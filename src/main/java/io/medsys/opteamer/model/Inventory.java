package io.medsys.opteamer.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "inventory")
public class Inventory {
    @Id
    @Column(name ="asset_id")
    private Long assetId;

    private Integer count;

    @OneToOne
    @MapsId
    @JoinColumn(name = "asset_id")
    private Asset asset;
}
