package Ejercicio1.impl;

import Ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	
	private String texto;
	private int likes;
	private boolean destacado;
	
	
	public WallPost text(String text) {
		this.setText(text);
		return this;
	}
	
	@Override
    public String getText() {
    	return this.texto;
    }
    
    @Override
    public void setText (String descriptionText) {
    	this.texto=descriptionText;
    }
    @Override
    public int getLikes() {
    	return this.likes;
    }
    @Override
    public WallPost like() {
    	this.likes++;
    	return this;
    }
    @Override
    public WallPost dislike() {
    	if(this.likes != 0) {
    		this.likes--;
    	}
    	return this;	
    }
    @Override
    public boolean isFeatured() {
    	return destacado;
    }
    @Override
    public WallPost toggleFeatured() {
    	if(this.destacado == true) {
    		this.destacado=false;
    	}else {
    		this.destacado=true;
    	}
    	return this;
    }
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }



	
  

}
