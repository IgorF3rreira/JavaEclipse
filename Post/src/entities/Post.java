package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	//AQUI VAMOS FAZER UM PRIVATE STATIC PARA TER SEMPRE A MASCARA AQUI AO ÍNVES
	//DE FICAR DECLARANDO ELA PARA CADA COMENTARIO QUE O USUARIO FOR COLOCAR
	private static 	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {
		
	}
	
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	
	public String toString() {
		//COMO UM POST PODE CONTER VARIOS COMENTARIOS , ENTAO VAMOS COLOCAR
		//A CLASSE STRINGBUILDERS PARA ARMAZENAR ESSES COMENTARIOS
		StringBuilder sb = new StringBuilder();
		// ESSE APPENDE SIGNIFICA ACRESCENTAR NO FINAL
		sb.append(title + "\n" );
		sb.append(likes);
		sb.append("Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		//PARA COLOCAR OS COMENTARIOS VAMOS FAZER UM FOREACH
		for(Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		
		return sb.toString();
		
	}
	
	
	
}