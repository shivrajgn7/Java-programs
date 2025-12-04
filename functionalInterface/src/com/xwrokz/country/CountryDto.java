package com.xwrokz.country;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@AllArgsConstructor
public class CountryDto {
    private int countryId;
    private String countryName;
    private int population;
    private String primeMinisterName;
    private int noOfState;
    private int areaInKm;
    private String continentName;
    private boolean isDemocratic;
    private String language;
}
