#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME}Repository implements I${NAME}Repository {

    //region Fields
    //endregion
    
    //region Constructors
    /**
     * Default constructor
     */
    public ${NAME}Repository (){
        super();
    }
    //endregion
    
    //region Fields
    
    //endregion
}