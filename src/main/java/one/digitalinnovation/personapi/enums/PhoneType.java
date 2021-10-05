package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType
{
    HOME( "Home" ),
    MOBILE( "Mobile" ),
    Commercial( "Comercial" );

    private final String description;
}
