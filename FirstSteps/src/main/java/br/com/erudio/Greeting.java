package br.com.erudio;

public final class Greeting {

		private long id;
		private String content;
		
		public Greeting(long id, String contente) {
			this.id = id;
			this.content = contente;
		}

		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}

}
