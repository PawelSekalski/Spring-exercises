package app.niereaktor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import app.niereaktor.model.Car;
import app.niereaktor.repository.CarRepo;

@SpringBootApplication
public class DMvc4DataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DMvc4DataApplication.class, args);
				
		//utworzenie tabeli zawierającej samochody
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("RS3", "Audi", 240000.0));
		cars.add(new Car("GT86", "Toyota", 120000.0));
		cars.add(new Car("Panda", "Fiat", 35000.0));
		cars.add(new Car("M4", "BMW", 430000.0));
		cars.add(new Car("Ducato", "Fiat", 75000.0));
		cars.add(new Car("SQ7", "Audi", 515000.0));
		cars.add(new Car("124", "Fiat", 255000.0));
		cars.add(new Car("Spyder", "Alfa Romeo", 80000.0));
		cars.add(new Car("718", "Porshe", 670000.0));
		cars.add(new Car("458 Italia", "Ferrari", 1150000.0));
		cars.add(new Car("Scirocco R", "Volkswagen", 78000.0));
		cars.add(new Car("Fiesta ST200", "Ford", 80000.0));

		CarRepo cr = ctx.getBean(CarRepo.class);	
		// save - zapisanie do bazy danych
		cars.forEach(cr::save);
		
	//	Car selectedCar = /*car repo*/ cr.findOne(3L);
	//	cr.delete(selectedCar);
		
		cr.findAll().forEach(System.out::println);
		
		cr.findAll().forEach(System.out::println);
		cr.count();
		
		List<Car> list1 = cr.findByBrand("Fiat");
		System.out.println(list1);
		
		List<Car> list2 = cr.findByPrice(75000.0);
		System.out.println(list2);
		
		List<Car> list3 = cr.findByName("");
		System.out.println(list3);
		
		List<Car> list4 = cr.findByBrandAndPrice("Toyota", 120000.0);
		System.out.println(list4);
	
		//System.out.println(list4, isEmpty());
		System.out.println(list4);

		List<Car> list5 = cr.findFirstByBrand("Fiat");
		System.out.println(list5);
		
		List<Car> list6 = cr.findFirst2ByBrand("Fiat");
		System.out.println(list6);
		
		List<Car> list7 = cr.findAllByBrandOrBrand("Fiat", "Audi");
		System.out.println(list7);
		
		List<Car> list8 = cr.findAllByBrandOrBrandOrderByNameDesc("Fiat", "Audi");
		System.out.println(list8);
		
		List<Car> list9 = cr.findAllByNameStartingWith("A");
		System.out.println(list9);

		List<Car> list10 = cr.findAllByNameLike("S%");
		System.out.println(list10);

		List<Car> list11 = cr.findAllByNameContaining("s");
		System.out.println(list11);

		List<Car> list12 = cr.findAllByNameEndingWith("a");
		System.out.println(list12);
		
		List<Car> list13 = cr.findAllByNameLike("P%A");
		System.out.println(list13);
		
		List<Car> list14 = cr.findAllByNameContainingAndNameStartingWith("oc", "S");
		System.out.println(list14);
		
		List<Car> list15 = cr.findAllByNameContainingAndBrandStartingWith("a", "F");
		System.out.println(list15);
		
		List<Car> list16 = cr.findAllByPriceLessThan(80001.0);
		System.out.println(list16);
		
		List<Car> list17 = cr.findAllByPriceBetween(500000.0, 700000.0);
		System.out.println(list17);
		
		List<Car> list18 = cr.findAllByBrandAndPriceLessThanEqual("Audi", 300000.0);
		System.out.println(list18);
		
		List<Car> list19 = cr.findAllByBrandAndPriceBetween("Fiat", 34999.9, 254999.9);
		System.out.println(list19);
		
		List<Car> list20 = cr.findAllByBrandContainingAndPriceBetween("f", 254999.9, 1150000.1);
		System.out.println(list20);
		
		List<Car> list21 = cr.findAllByBrandOrderByNameDesc("Fiat");
		System.out.println(list21);
		
		List<Car> list22 = cr.findAllByBrandNotNullOrderByPriceDesc();
		System.out.println(list22);
		
		/*
		List<Car> list = cr.();
		System.out.println(list);
		*/
		
		ctx.close();
		
	}

}
