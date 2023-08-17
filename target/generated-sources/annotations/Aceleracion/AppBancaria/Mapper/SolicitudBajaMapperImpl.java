package Aceleracion.AppBancaria.Mapper;

import Aceleracion.AppBancaria.Entidades.Dto.Request.SolicitudBajaDTO;
import Aceleracion.AppBancaria.Entidades.Dto.Response.SolicitudBajaResponseDTO;
import Aceleracion.AppBancaria.Entidades.SolicitudBaja;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-16T21:14:50-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
public class SolicitudBajaMapperImpl implements SolicitudBajaMapper {

    @Override
    public SolicitudBaja solicitudBajaDtoToSolicitudBaja(SolicitudBajaDTO solicitudBajaDTO) {
        if ( solicitudBajaDTO == null ) {
            return null;
        }

        SolicitudBaja solicitudBaja = new SolicitudBaja();

        solicitudBaja.setMotivo( solicitudBajaDTO.getMotivo() );

        return solicitudBaja;
    }

    @Override
    public List<SolicitudBajaResponseDTO> solicitudBajaListToSolicitudBajaResponseDtoList(List<SolicitudBaja> solicitudBaja) {
        if ( solicitudBaja == null ) {
            return null;
        }

        List<SolicitudBajaResponseDTO> list = new ArrayList<SolicitudBajaResponseDTO>( solicitudBaja.size() );
        for ( SolicitudBaja solicitudBaja1 : solicitudBaja ) {
            list.add( solicitudBajaToSolicitudBajaResponseDTO( solicitudBaja1 ) );
        }

        return list;
    }

    @Override
    public List<SolicitudBajaResponseDTO> SolicitudBajaResponseDtoToSolicitudBaja(List<SolicitudBaja> solicitudBaja) {
        if ( solicitudBaja == null ) {
            return null;
        }

        List<SolicitudBajaResponseDTO> list = new ArrayList<SolicitudBajaResponseDTO>( solicitudBaja.size() );
        for ( SolicitudBaja solicitudBaja1 : solicitudBaja ) {
            list.add( solicitudBajaToSolicitudBajaResponseDTO( solicitudBaja1 ) );
        }

        return list;
    }

    protected SolicitudBajaResponseDTO solicitudBajaToSolicitudBajaResponseDTO(SolicitudBaja solicitudBaja) {
        if ( solicitudBaja == null ) {
            return null;
        }

        SolicitudBajaResponseDTO solicitudBajaResponseDTO = new SolicitudBajaResponseDTO();

        solicitudBajaResponseDTO.setId( solicitudBaja.getId() );
        solicitudBajaResponseDTO.setCliente( clienteToClienteResponseDto( solicitudBaja.getCliente() ) );
        solicitudBajaResponseDTO.setMotivo( solicitudBaja.getMotivo() );

        return solicitudBajaResponseDTO;
    }
}
