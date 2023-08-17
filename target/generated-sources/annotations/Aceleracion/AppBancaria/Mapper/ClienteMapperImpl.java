package Aceleracion.AppBancaria.Mapper;

import Aceleracion.AppBancaria.Entidades.Cliente;
import Aceleracion.AppBancaria.Entidades.Dto.Request.ClienteRequestActualizarDTO;
import Aceleracion.AppBancaria.Entidades.Dto.Request.ClienteRequestDTO;
import Aceleracion.AppBancaria.Entidades.Dto.Response.ClienteResponseActulizarDTO;
import Aceleracion.AppBancaria.Entidades.Dto.Response.ClienteResponseDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-16T21:14:50-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public void actualizarDatosDtoToClinte(ClienteRequestActualizarDTO clienteRequestActualizarDTO, Cliente cliente) {
        if ( clienteRequestActualizarDTO == null ) {
            return;
        }

        if ( clienteRequestActualizarDTO.getId() != null ) {
            cliente.setId( clienteRequestActualizarDTO.getId() );
        }
        if ( clienteRequestActualizarDTO.getEmail() != null ) {
            cliente.setEmail( clienteRequestActualizarDTO.getEmail() );
        }
        if ( clienteRequestActualizarDTO.getNombre() != null ) {
            cliente.setNombre( clienteRequestActualizarDTO.getNombre() );
        }
        if ( clienteRequestActualizarDTO.getApellido() != null ) {
            cliente.setApellido( clienteRequestActualizarDTO.getApellido() );
        }
        if ( clienteRequestActualizarDTO.getDni() != null ) {
            cliente.setDni( clienteRequestActualizarDTO.getDni() );
        }
        if ( clienteRequestActualizarDTO.getTelefono() != null ) {
            cliente.setTelefono( clienteRequestActualizarDTO.getTelefono() );
        }
    }

    @Override
    public ClienteResponseActulizarDTO clienteToClienteResposeActualizarDTO(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteResponseActulizarDTO clienteResponseActulizarDTO = new ClienteResponseActulizarDTO();

        clienteResponseActulizarDTO.setEmail( cliente.getEmail() );
        clienteResponseActulizarDTO.setNombre( cliente.getNombre() );
        clienteResponseActulizarDTO.setApellido( cliente.getApellido() );
        clienteResponseActulizarDTO.setDni( cliente.getDni() );
        clienteResponseActulizarDTO.setTelefono( cliente.getTelefono() );

        return clienteResponseActulizarDTO;
    }

    @Override
    public ClienteResponseDTO clienteToClienteResponseDto(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteResponseDTO clienteResponseDTO = new ClienteResponseDTO();

        clienteResponseDTO.setNombre( cliente.getNombre() );
        clienteResponseDTO.setApellido( cliente.getApellido() );
        clienteResponseDTO.setEmail( cliente.getEmail() );

        return clienteResponseDTO;
    }

    @Override
    public Cliente clienteResponseDtoToCliente(ClienteRequestDTO clienteResponseDTO) {
        if ( clienteResponseDTO == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setEmail( clienteResponseDTO.getEmail() );
        cliente.setPassword( clienteResponseDTO.getPassword() );
        cliente.setNombre( clienteResponseDTO.getNombre() );
        cliente.setApellido( clienteResponseDTO.getApellido() );
        cliente.setDni( clienteResponseDTO.getDni() );
        cliente.setTelefono( clienteResponseDTO.getTelefono() );

        return cliente;
    }
}
