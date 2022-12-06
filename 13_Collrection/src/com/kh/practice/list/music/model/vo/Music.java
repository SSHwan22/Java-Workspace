package com.kh.practice.list.music.model.vo;

<<<<<<< Updated upstream
import javax.print.attribute.standard.MediaSize.Other;

public class Music<Muisc> implements Comparable<Object>{
=======
public class Music<Muisc> implements Comparable{
>>>>>>> Stashed changes
	private String title;
	private String singer;

	public Music() {

	}

	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
<<<<<<< Updated upstream
		return "Music [title=" + title + ", singer=" + singer + "]";
=======
		return singer+" - "+title;
>>>>>>> Stashed changes
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((singer == null) ? 0 : singer.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		if (singer == null) {
			if (other.singer != null)
				return false;
		} else if (!singer.equals(other.singer))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
<<<<<<< Updated upstream
		Music other = (Muisc) o;
		if(this.title.compareTo(Other.title) == 0) {
			return this.title.compareTo(other.title);
		}else {
			return this.compareTo(other.title);
=======
		Music other = (Music) o;
		if(this.title.compareTo(other.title) == 0) {
			return this.singer.compareTo(other.singer);
		}else {
			return this.title.compareTo(other.title);
>>>>>>> Stashed changes
		}
	}
		
}
