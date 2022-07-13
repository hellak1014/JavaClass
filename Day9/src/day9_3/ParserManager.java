package day9_3;

interface Parseable{
	public abstract void parse(String fileName);
}

	class ParserManager {
	
	public static Parseable getParser(String type) {
		if (type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
		}
	}

}
