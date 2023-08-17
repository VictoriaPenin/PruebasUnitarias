package Aceleracion.AppBancaria.Mapper;

import Aceleracion.AppBancaria.Entidades.CajaDeAhorro;
import Aceleracion.AppBancaria.Entidades.Dto.Response.CajaAhorroDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-16T21:14:50-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
public class CajaAhorroMapperImpl implements CajaAhorroMapper {

    @Override
    public List<CajaAhorroDTO> listCajaDeAhorroToListCajaAhorroDTO(List<CajaDeAhorro> cajaDeAhorro) {
        if ( cajaDeAhorro == null ) {
            return null;
        }

        List<CajaAhorroDTO> list = new ArrayList<CajaAhorroDTO>( cajaDeAhorro.size() );
        for ( CajaDeAhorro cajaDeAhorro1 : cajaDeAhorro ) {
            list.add( cajaDeAhorroToCajaAhorroDTO( cajaDeAhorro1 ) );
        }

        return list;
    }

    @Override
    public CajaDeAhorro cajaAhorroDtoToCajaAhorroDeAhorro(CajaAhorroDTO cajaAhorroDTO) {
        if ( cajaAhorroDTO == null ) {
            return null;
        }

        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro();

        cajaDeAhorro.setId( cajaAhorroDTO.getId() );
        cajaDeAhorro.setSaldo( cajaAhorroDTO.getSaldo() );
        cajaDeAhorro.setCbu( cajaAhorroDTO.getCbu() );

        return cajaDeAhorro;
    }

    protected CajaAhorroDTO cajaDeAhorroToCajaAhorroDTO(CajaDeAhorro cajaDeAhorro) {
        if ( cajaDeAhorro == null ) {
            return null;
        }

        CajaAhorroDTO cajaAhorroDTO = new CajaAhorroDTO();

        cajaAhorroDTO.setId( cajaDeAhorro.getId() );
        cajaAhorroDTO.setSaldo( cajaDeAhorro.getSaldo() );
        cajaAhorroDTO.setCbu( cajaDeAhorro.getCbu() );

        return cajaAhorroDTO;
    }
}
