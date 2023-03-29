package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	private String Text;
	private int Likes;
	private Boolean isFeatured;
	
	
	
	public WallPostImpl() {
		this.Text="Undefined post";
		this.Likes=0;
		this.isFeatured=false;
	}
	@Override
	public String getText() {
		return this.Text;
	}
	@Override
	public void setText(String text) {
		this.Text = text;
	}
	@Override
	public int getLikes() {
		return Likes;
	}

	@Override
	public void like() {
		this.Likes++;
		
	}
	@Override
	public void dislike() {
		if(this.Likes != 0) {
			this.Likes--;
		}
	}
	
	@Override
	public boolean isFeatured() {
		return this.isFeatured;
	}
	@Override
	public void toggleFeatured() {
		if(this.isFeatured ==true) {
			this.isFeatured=false;
		}
		else this.isFeatured=true;
	}
	
	
	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }


}
