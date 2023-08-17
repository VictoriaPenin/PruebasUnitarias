package Aceleracion.AppBancaria.Mapper;

import Aceleracion.AppBancaria.Entidades.Dto.Request.SucursalRequestDTO;
import Aceleracion.AppBancaria.Entidades.Sucursal;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-16T21:14:50-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
public class SucursalMapperImpl implements SucursalMapper {

    @Override
    public Sucursal sucursalRequestDtoToSucursal(SucursalRequestDTO sucursalRequestDTO) {
        if ( sucursalRequestDTO == null ) {
            return null;
        }

        Sucursal sucursal = new Sucursal();

        sucursal.setNombreSucursal( sucursalRequestDTO.getNombreSucursal() );
        sucursal.setDirrecion( sucursalRequestDTO.getDirrecion() );

        return sucursal;
    }
}
