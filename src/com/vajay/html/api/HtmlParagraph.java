package com.vajay.html.api;

public class HtmlParagraph extends HtmlElement {

	public HtmlParagraph() {
		super(null);
	}
	
	public HtmlParagraph(String text) {
		super(text);
	}

	@Override
	protected String getTagName() {
		return "p";
	}

	@Override
	protected String childElementsToString() {
		String childElementsString = "";
		
		if (this.childElements.size() > 0) {
			StringBuilder builder = new StringBuilder();
			
			for (HtmlElement childElement : this.childElements) {
				builder.append(childElement.toString().trim());
			}
			
			childElementsString = builder.toString();
		}
		
		return childElementsString;
	}
}
