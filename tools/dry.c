#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* concat(char *s1, char *s2)
{
    char* result = malloc(strlen(s1) + strlen(s2) + 1);

    strcpy(result, s1);
    strcat(result, s2);

    return result;
}

int main (int argc, char* argv[])
{
	char cwd[1024];
	getcwd(cwd, sizeof(cwd));

	char* scriptPath = concat(cwd, "/");
	scriptPath = concat(scriptPath, argv[1]);

	char* command = "java -jar ";
	command = concat(command, argv[0]);
	command = concat(command, ".jar ");
	command = concat(command, scriptPath);

	for (int i = 2; i < argc; i++)
	{
		command = concat(command, " ");
		command = concat(command, argv[i]);
	}

	return system(command);
}