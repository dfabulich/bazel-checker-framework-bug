import javax.annotation.Nonnull;
public class X {
	public static void main(String[] args) {
		new X().exec();
	}

	public void exec() {
		System.out.println(this.method());
	}

	@Nonnull
	private String method() {
		return null;
	}
}