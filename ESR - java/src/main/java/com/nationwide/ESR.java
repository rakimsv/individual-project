package com.nationwide;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ESR {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int client_id;
		
		private String client_name;
		private String game;
		private String platform;
		private String genre;
		private String description;
		private String image_path;
		
		public int getClient_id() {
			return client_id;
		}
		public void setClient_id(int client_id) {
			this.client_id = client_id;
		}
		public String getClient_name() {
			return client_name;
		}
		public void setClient_name(String client_name) {
			this.client_name = client_name;
		}
		public String getGame() {
			return game;
		}
		public void setGame(String game) {
			this.game = game;
		}
		public String getPlatform() {
			return platform;
		}
		public void setPlatform(String platform) {
			this.platform = platform;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getImage_path() {
			return image_path;
		}
		public void setImage_path(String image_path) {
			this.image_path = image_path;
		}
		@Override
	    public String toString() {
	        return "ESR{" +
	                "id=" + client_id +
	                ", name='" + client_name + '\'' +
	                ", game='" + game + '\'' +
	                ", platform='" + platform + '\'' +
	                ", genre='" + genre + '\'' +
	                ", description='" + description + '\'' +
	                ", image='" + image_path + '\'' +
	                
	                '}';
	    }
}
