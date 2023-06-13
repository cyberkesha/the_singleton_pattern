package the_singleton_pattern;

public class Singleton {
	/* Только один экземпляр
	   Глобальная точка доступа к экземляру */
	
	// Закрытый конструктор
	private Singleton() { };
	
	// Статическая переменная
	private static Singleton uniqueInstance = new Singleton();

	// Статический метод, т.к. невозможно вызывать конструктор
	public static Singleton getInstance() {
		return uniqueInstance;
	}
}
