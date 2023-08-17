package Aceleracion.AppBancaria.Mapper;

import Aceleracion.AppBancaria.Entidades.Banco;
import Aceleracion.AppBancaria.Entidades.Dto.Request.BancoRequestDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-16T21:14:50-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
public class BancoMapperImpl implements BancoMapper {

    @Override
    public Banco bancoRequestDtoToBanco(BancoRequestDTO bancoRequestDTO) {
        if ( bancoRequestDTO == null ) {
            return null;
        }

        Banco banco = new Banco();

        banco.setNombre( bancoRequestDTO.getNombre() );

        return banco;
    }
}
