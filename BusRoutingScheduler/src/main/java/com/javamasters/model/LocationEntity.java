package com.javamasters.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;



@Data
@NoArgsConstructor
public class LocationEntity {
    @Id
    private String id;
    private String locationName;

    public LocationEntity(String locationName) {
        this.locationName = locationName;
    }
}
