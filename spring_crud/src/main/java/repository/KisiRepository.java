package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Kisi;
//<Model PrimaryKey
///spring in kendi içinde olan bir interface den extends
//kişiyi saklıyacak bir repository, primary key (id) integer old için içine birde Integer yazdık
public interface KisiRepository extends JpaRepository<Kisi, Integer> {

}
