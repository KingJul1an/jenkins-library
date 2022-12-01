import groovy.transform.Field

@Field String STEP_NAME = getClass().getName()
@Field String METADATA_FILE = 'metadata/checkmarxoneExecuteScan.yaml'

//Metadata maintained in file project://resources/metadata/checkmarxExecuteScan.yaml

void call(Map parameters = [:]) {
    List credentials = [[type: 'usernamePassword', id: 'checkmarxoneCredentialsId', env: ['PIPER_username', 'PIPER_password']]]
    piperExecuteBin(parameters, STEP_NAME, METADATA_FILE, credentials, true)
}
