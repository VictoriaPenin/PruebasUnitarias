package Aceleracion.AppBancaria.Servicios;

import Aceleracion.AppBancaria.Entidades.Banco;
import Aceleracion.AppBancaria.Entidades.Dto.Request.SucursalRequestDTO;
import Aceleracion.AppBancaria.Entidades.Sucursal;
import Aceleracion.AppBancaria.Repositorios.RepositorioSucursal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@SpringBootTest
public class ServicioSucursalTest {

    @Mock
    private RepositorioSucursal repoSucursal;
    @Mock
    private ServicioBanco servBanco;

    @InjectMocks
    private ServicioSucursal servicioSucursal;

    @Test
    @DisplayName("Prueba para guardar sucursal")
    public void crearSucursal() throws Exception {

        SucursalRequestDTO sucursalRequestDTO = new SucursalRequestDTO();

        Banco bancoMock = new Banco();
        Mockito.when(servBanco.buscarBanco(anyLong())).thenReturn(bancoMock);

        servicioSucursal.crearSucursal(sucursalRequestDTO);


        Mockito.verify(repoSucursal, times(1)).save(any(Sucursal.class));
    }

    @Test
    @DisplayName("Prueba para buscar sucursal")

    public void buscarSucursal() throws Exception {
        Long sucursalId = 10L;
        Sucursal sucursal = new Sucursal();
        Mockito.when(repoSucursal.findById(sucursalId)).thenReturn(Optional.of(sucursal));

        Sucursal resultado = servicioSucursal.buscarSucursal(sucursalId);
        assertEquals(sucursal, resultado);
    }


}