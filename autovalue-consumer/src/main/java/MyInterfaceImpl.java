import java.util.List;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class MyInterfaceImpl implements MyInterface {
	public static MyInterfaceImpl create(String bar, List<?> bars, int foo) {
		return new AutoValue_MyInterfaceImpl(foo,bar, bars);
	}
}
