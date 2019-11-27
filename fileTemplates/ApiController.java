#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME}Controller extends CnpApiController {

    //region Fields
    /**
     * ${NAME}s manager
     */
    @Autowired
    private I${NAME}Service ${NAME}Service;
    //endregion
    
    //region Constructors
    public ${NAME}Controller (){
        super();
    }
    //endregion
    
    //region Public methods
    
    //endregion
}