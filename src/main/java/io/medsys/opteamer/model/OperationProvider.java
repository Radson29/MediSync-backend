package io.medsys.opteamer.model;


import io.medsys.opteamer.model.enums.OperationProviderType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "operation_providers")
public class OperationProvider {
    @Id
    @Enumerated(EnumType.STRING)
    @Column(name="type")
    private OperationProviderType type;

}
