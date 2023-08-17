package Aceleracion.AppBancaria.Mapper;

import Aceleracion.AppBancaria.Entidades.Dto.Request.EmpleadoRequestDTO;
import Aceleracion.AppBancaria.Entidades.Empleado;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-16T21:14:50-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
public class EmpleadoMapperImpl implements EmpleadoMapper {

    @Override
    public Empleado empleadoRequestDtoToEmpleado(EmpleadoRequestDTO empleadoRequestDTO) {
        if ( empleadoRequestDTO == null ) {
            return null;
        }

        Empleado empleado = new Empleado();

        empleado.setNombre( empleadoRequestDTO.getNombre() );
        empleado.setApellido( empleadoRequestDTO.getApellido() );
        empleado.setDni( empleadoRequestDTO.getDni() );

        return empleado;
    }
}
