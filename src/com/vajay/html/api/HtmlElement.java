package com.vajay.html.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class HtmlElement {
	protected Map<String, String> properties;
	protected List<HtmlElement> childElements;
	protected int indentSpaceCount;
	protected int indentDepth;
	protected String text;

	{
		properties = new HashMap<>();
		childElements = new ArrayList<>();
		this.indentSpaceCount = 5;
		this.indentDepth = 1;
		this.text = null;
	}

	public HtmlElement(String text) {
		this.text = text;
	}

	public HtmlElement(int indentSpaceCount, int indentDepth) {
		this.indentSpaceCount = indentSpaceCount;
		this.indentDepth = indentDepth;
	}

	public HtmlElement(int indentSpaceCount, int indentDepth, String text) {
		this.indentSpaceCount = indentSpaceCount;
		this.indentDepth = indentDepth;
		this.text = text;
	}

	public void addProperty(String name, String value) {
		if (name == null || name.isEmpty() || value == null || value.isEmpty()) {
			return;
		}

		this.properties.put(name, value);
	}

	public void addChildElement(HtmlElement element) {
		if (element == null) {
			return;
		}

		this.childElements.add(element);
	}

	public void removeChildElement(HtmlElement element) {
		if (element == null) {
			return;
		}

		this.childElements.remove(element);
	}

	protected abstract String getTagName();

	protected void setIndentDepth(int indentDepth) {
		this.indentDepth = indentDepth;
	}

	protected void setIndentSpaceCount(int indentSpaceCount) {
		this.indentSpaceCount = indentSpaceCount;
	}

	private String indentationToString() {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < indentDepth * indentSpaceCount; i++) {
			builder.append(" ");
		}
		
		return builder.toString();
	}
	
	private String propertiesToString() {
		String props = "";
		
		if (!this.properties.entrySet().isEmpty()) {
			StringBuilder builder = new StringBuilder();
			
			for (Map.Entry<String, String> property : this.properties.entrySet()) {
				builder.append(" ");
				builder.append(property.getKey());
				builder.append("=\"");
				builder.append(property.getValue());
				builder.append("\"");
			}
			
			props = builder.toString();			
		}
		
		return props;
	}
	
	private String childElementsToString() {
		String childElementsString = "";
		
		if (this.childElements.size() > 0) {
			StringBuilder builder = new StringBuilder();
			
			builder.append(System.lineSeparator());

			for (HtmlElement childElement : this.childElements) {
				// Child elements has to be adjusted to the correct indentation depth
				childElement.setIndentDepth(this.indentDepth + 1);
				childElement.setIndentSpaceCount(this.indentSpaceCount);
	
				builder.append(childElement.toString());
			}

			builder.append(indentationToString());
			
			childElementsString = builder.toString();
		}
		
		return childElementsString;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(indentationToString());

		builder.append("<");
		builder.append(this.getTagName());
		builder.append(propertiesToString());
		builder.append(">");

		if (this.text != null) {
			builder.append(this.text);
		}
		
		builder.append(childElementsToString());

		builder.append("</");
		builder.append(this.getTagName());
		builder.append(">");
		builder.append(System.lineSeparator());

		return builder.toString();
	}
}
