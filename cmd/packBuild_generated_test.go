//go:build unit
// +build unit

package cmd

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestPackBuildCommand(t *testing.T) {
	t.Parallel()

	testCmd := PackBuildCommand()

	// only high level testing performed - details are tested in step generation procedure
	assert.Equal(t, "packBuild", testCmd.Use, "command name incorrect")

}
