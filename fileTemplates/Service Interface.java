#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public interface I${NAME}Service extends ICNPService<${NAME}DTO> {
}