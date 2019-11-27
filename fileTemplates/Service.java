#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME}Service implements I${NAME}Service {

    //region Fields
    /**
     * ${NAME}s manager
     */
    @Autowired
    private I${NAME}Repository ${NAME}Repository;
    //endregion
    
    //region Constructors
    public ${NAME}Service (){
        super();
    }
    //endregion
    
    //region Methods
    
    //endregion
}