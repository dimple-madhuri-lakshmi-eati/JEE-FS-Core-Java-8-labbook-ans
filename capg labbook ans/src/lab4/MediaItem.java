package lab4;

abstract class MediaItem extends Item{
	private int runtime;

	public MediaItem(int runtime) {
		super();
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

}
