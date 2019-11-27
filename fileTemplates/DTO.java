#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME}DTO implements IDTO {

    //region Fields
    
    //endregion
    
    //region Getters and setters
    
    //endregion
    
    //region Constructors
    /**
     * Default constructor
     */
    public ${NAME}DTO (){
        super();
    }
    //endregion
    
}