package gormerror

class Content {

	String text

    static constraints = {
    	text(nullable:true, blank:true)
    }

	static mapping = {
		datasource 'master'
	}
}
