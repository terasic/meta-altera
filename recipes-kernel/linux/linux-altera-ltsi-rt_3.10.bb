
LINUX_VERSION_SUFFIX = "-ltsi-rt"

KTYPE = "preempt-rt"

PR = "r5"
SRCREV ?= "${AUTOREV}"
PV = "3.10-${PR}+git${SRCREV}"

require recipes-kernel/linux/linux-altera.inc

