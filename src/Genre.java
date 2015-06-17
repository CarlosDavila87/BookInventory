
public enum Genre {
	HORROR("Horror"),
	ACTION("Action"),
	BIOGRAPHY("Biography"),
	COMEDY("Comedy"),
	SPORTS("Sports"),
	MATHEMATICS("Mathematics"),
	SCIENCE("Science"),
	TRUECRIME("True-Crime");

	private String genrename;
	
	private Genre(String topic){
		genrename = topic;
	}

	public String getGenrename() {
		return genrename;
	}

	public void setGenrename(String genrename) {
		this.genrename = genrename;
	}
}
