package app.niereaktor.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.niereaktor.model.Car;

@Repository
public interface CarRepo extends JpaRepository <Car,Long> {
	
	List<Car> findByBrand(String brand);
	List<Car> findByPrice(Double price);
	List<Car> findByName(String name);
	List<Car> findByBrandAndPrice(String name, Double price);
	List<Car> findFirstByBrand(String brand);
	List<Car> findFirst2ByBrand(String brand);
	List<Car> findBottomByBrand(String brand);
	//select * from car where brand = b1 or brand = b2
	List<Car> findAllByBrandOrBrand(String brand1, String brand2); //różnicować wyszukiwania
	List<Car> findAllByBrandOrBrandOrderByNameDesc(String brand1, String brand2); //różnicować wyszukiwania
	List<Car> findAllByNameStartingWith(String name);
	List<Car> findAllByNameLike(String pattern);
	//zawierająca
	List<Car> findAllByNameContaining(String pattern);
	//kończąca się na 
	List<Car> findAllByNameEndingWith(String pattern);
	//zawierająca w nazwie i zaczynająca sie na
	List<Car> findAllByNameContainingAndNameStartingWith(String pattern1, String pattern2);
	//zawierająca w nazwie i zaczynająca sie na w marce
	List<Car> findAllByNameContainingAndBrandStartingWith(String pattern1, String pattern2);
	//cena:
	//cenie mniejszej niż
	List<Car> findAllByPriceLessThan(double price);
	//cenie pomiędzy
	List<Car> findAllByPriceBetween(double low, double high);
	//cenie mniejszej niż, przy marce
	List<Car> findAllByBrandAndPriceLessThanEqual(String brand, double price);
	//cenie pomiędzy, przy marce
	List<Car> findAllByBrandAndPriceBetween(String brand, double low, double high);
	//cenie pomiędzy, przy marce zawierającej
	List<Car> findAllByBrandContainingAndPriceBetween(String pattern, double low, double high);
	//sortowanie:
	//wszystie w marce sortując po cenie malejąco
	List<Car> findAllByBrandOrderByNameDesc(String brand);
	//wszystke samochody desc po cenie
	List<Car> findAllByBrandNotNullOrderByPriceDesc();

	// findBy..And..; findBy..Or.. (String x, Double y)- dwa parametry
	
}
