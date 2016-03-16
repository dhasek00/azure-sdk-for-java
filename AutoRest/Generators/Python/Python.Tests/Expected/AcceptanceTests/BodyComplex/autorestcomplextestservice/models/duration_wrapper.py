# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class DurationWrapper(Model):
    """DurationWrapper

    :param field:
    :type field: timedelta
    """ 

    _attribute_map = {
        'field': {'key': 'field', 'type': 'duration'},
    }

    def __init__(self, field=None, **kwargs):
        self.field = field
