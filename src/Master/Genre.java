package Master;

public enum Genre {
	HORROR("Horror"),
	ACTION("Action"),
	BIOGRAPHY("Biography"),
	COMEDY("Comedy"),
	SPORTS("Sports"),
	MATHEMATICS("Mathematics"),
	SCIENCE("Science"),
	TRUECRIME("True-Crime");

	private String name;
	
	private Genre(String topic){
		name = topic;
	}

	public String getGenrename() {
		return name;
	}

	public void setGenrename(String genrename) {
		this.name = genrename;
	}
}
