package org.ignacio.finalProject.model;

public class BillArticle {
	String articleId,cuantity;
	
	public BillArticle(String articleId1, String cuantity1){
		
			this.articleId=articleId1;
			this.cuantity=cuantity1;
		}
		public String getArticleId() {
			return articleId;
		}
		public void setArticleId(String articleId) {
			this.articleId = articleId;
		}
		public String getCuantity() {
			return cuantity;
		}
		public void setCuantity(String cuantity) {
			this.cuantity = cuantity;
		}
}
