package pe.com.apiescuelanueva.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apiescuelanueva.entity.DistritoEntity;

//Como primer parametro al repository, le colocamos el nombre de nuestra clase
//y como segundo parametro, le colocamos el tipo de dato 'Long' porq va a recibir numeros enteros
//NOTA: Spring no trabaja con el tipo de dato 'int' por eso es q se trabaja con el 'Long'
public interface DistritoRepository extends JpaRepository<DistritoEntity, Long> {
    @Query("select d from DistritoEntity d where d.estado=1")
    List<DistritoEntity> findAllCustom();
}
